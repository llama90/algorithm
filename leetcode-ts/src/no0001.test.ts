import {expect} from 'chai';

import {No0001} from './no0001';

describe('no0001 test', function () {
    it('(example01) should return two number for the target', () => {
        const no0001 = new No0001();
        expect(no0001.twoSum([2, 7, 11, 15], 9)).deep.equal([1, 0])
    });

    it('(example02) should return two number for the target', () => {
        const no0001 = new No0001();
        expect(no0001.twoSum([3, 2, 4], 6)).deep.equal([2, 1])
    });

    it('(example03) should return two number for the target', () => {
        const no0001 = new No0001();
        expect(no0001.twoSum([3, 3], 6)).deep.equal([1, 0])
    });
});